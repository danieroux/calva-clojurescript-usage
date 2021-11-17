(ns tooling.portal
  (:require
   [portal.web :as p]))

(defn open-portal
  []
  (def p (p/open))
  (add-tap #'p/submit)
  (tap> {::open-portal "Hello! Portal has been opened."}))

#_ (open-portal)