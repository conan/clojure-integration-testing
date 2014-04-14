(ns it.core
  (:require [conf-er :refer [config]]
            [ring.adapter.jetty :refer [run-jetty]]))

(defn handler [request]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello world"})

(def server (atom nil))

(defn start-server
  []
  (swap! server (fn [_] (run-jetty handler {:port 3000 :join? false})))
  (println "Server started"))

(defn stop-server
  []
  (.stop @server))
