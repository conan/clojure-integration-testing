(defproject it "1.0.0-SNAPSHOT"
  :description "An example of integration testing in Clojure"
  :dependencies [[clj-http "0.9.1"]
                 [conf-er "1.0.1"]
                 [midje "1.6.3"]
                 [org.clojure/clojure "1.5.1"]
                 [ring "1.2.2"]]
  :jvm-opts ["-Dconfig=application.conf"]
  :profiles {:test {:jvm-opts ["-Dconfig=test.conf"]}})


