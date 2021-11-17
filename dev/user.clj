(ns user
  (:require
    [figwheel.main.api]))

;; https://shadow-cljs.github.io/docs/UsersGuide.html#_clojure_repl
(defn start-cljs-repl []
  (let [read-build (figwheel.main.api/read-build "common" "local")
        build-id   (:id read-build)]
    (try
      (figwheel.main.api/start {:mode :serve} read-build)
      (figwheel.main.api/cljs-repl build-id)
      (catch RuntimeException _e
        (println "The build is already running, connection to the REPL only")
        (figwheel.main.api/cljs-repl build-id)))))

(comment

  (start-cljs-repl)

  (figwheel.main/reset)

  ;; Stops Figwheel from watching the file system
  ;; Useful for when you are doing heavy REPL work
  (figwheel.main/stop-builds "local")
  (figwheel.main/start-builds "local")
  (figwheel.main/clean "local")

  ())
  
