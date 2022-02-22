(ns br.eng.crisjr.websockets
  (:gen-class)
  (:require [org.httpkit.server :as server]))

(defn- handler [request]
  (server/with-channel request channel 
    (server/on-close channel
      (fn [status]
        (println "Client closed channel: " status)))
    (server/on-receive channel
      (fn [data] ; right now, only sending data back
        (server/send! channel data)))))

(defn -main [& args]
  (let [port 9090]
    (server/run-server handler {:port port})
    (println (str "Listening at ws://localhost:" port "/"))))
