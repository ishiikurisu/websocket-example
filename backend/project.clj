(defproject br.eng.crisjr.websockets "0.1.0-SNAPSHOT"
  :description "Websocket Example"
  :url "https://www.crisjr.eng.br/"
  :license {:name "Beerware"
            :url "https://www.crisjr.eng.br"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [http-kit "2.3.0"]]
  :main ^:skip-aot br.eng.crisjr.websockets
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
