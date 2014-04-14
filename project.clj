(defproject it "0.1.0-SNAPSHOT"
  :description "An example of integration testing in Clojure"
  :dependencies [
                 ;[clj-http "0.9.1"]
                  [clj-http "0.7.9"]
                 [conf-er "1.0.1"]
                 [midje "1.6.3"]
                 [org.clojure/clojure "1.5.1"]
                 [ring "1.2.2"]]
  :main it.core
  :jvm-opts ["-Dconfig=application.conf"]
  :profiles {:test {:jvm-opts ["-Dconfig=test.conf"]}})


