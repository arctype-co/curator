(defproject arctype/curator "0.1.0-SNAPSHOT"
  :description "Clojurified Apache Curator"
  :url "https://github.com/arctype-co/curator"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.apache.curator/curator-recipes "4.2.0"]
                 [org.apache.curator/curator-framework "4.2.0"]
                 [org.apache.curator/curator-x-discovery "4.2.0"]]
  :profiles {:dev {:dependencies [[org.slf4j/log4j-over-slf4j "1.7.26"]
                                  [org.slf4j/slf4j-simple "1.7.26"]]
                   :exclusions [org.slf4j/slf4j-log4j12]}}
  :scm {:name "git"
        :url "https://github.com/arctype-co/curator"})
