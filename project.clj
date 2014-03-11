(defproject genetic-meta "0.1.0"
  :description "optimize the parameters for other genetic algorithms with GA"
  :url "https://github.com/saulshanabrook/genetic-meta"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [genetic-evolvesum "0.1.0"]
                 [genetic "0.1.0"]
                 [roul "0.2.0"]]
  :main ^:skip-aot genetic.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
