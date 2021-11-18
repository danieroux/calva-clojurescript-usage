(ns tooling.portal
  (:require
   [portal.web :as p]))

(defn open-portal
  []
  (def p (p/open))
  #_ (def p (p/open {:launcher :vs-code}))
  (add-tap #'p/submit)
  (tap> {::open-portal "Hello! Portal has been opened."}))

(comment
  (open-portal))
  