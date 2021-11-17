clean:
	@echo "Cleaning out any previous compilation"
	rm -rf resources/public/js dist out classes

install-npm-modules:
	npm install

prebuild: install-npm-modules
	clojure -A:figwheel:test:dev:nrepl -Stree

repl: clean prebuild
	@echo "\nConnect to the nREPL, and evaluate (start-cljs-repl):\n\n"
	clojure -M:figwheel:test:dev:nrepl

local-advanced-compilation: clean prebuild
	clojure -M --main cljs.main --compile-opts common.cljs.edn --compile-opts min.cljs.edn --compile-opts local-advanced-test.cljs.edn --compile
