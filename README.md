# Getting started with Calva

1. Start a Clojure REPL: `make repl` 
2. Connect to that via the "Connect to a Running REPL Server in the Project" command in VS Code. Choose "Generic" as the connection type. And copy & paste the port from where you did `make repl`
3. Start a ClojureScript REPL: In `dev/user.clj`, evaluate `(start-cljs-repl)`
4. Open a browser at http://localhost:9010 when it is done and says so
5. When it is connected, it will have a `clj꞉cljs.user꞉>` prompt.

... from here I want to open portal.cljs, eval the file and have Portal pop up.

It requires some fiddling with “Toggle the REPL connection” for both output.calva-repl and my portal.cljs. And I have not found a sequence that is reliable yet.