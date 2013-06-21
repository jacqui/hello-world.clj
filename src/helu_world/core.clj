(ns helu-world.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "1. Lock the target")
  (println "2. Bait the line")
  (println "3. Slowly spread the net")
  (println "4. Catch the man!"))
