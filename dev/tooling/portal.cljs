(ns tooling.portal
  (:require
   [portal.web :as p]))

(defn open-portal
  []
  (let [ui (p/open)]
    (add-tap #'p/submit)
    (tap> {::open-portal "Hello! Portal has been opened."})
    ui))

(comment
  (open-portal)
  (tap> "Tap, tap! Who's there?"))
  