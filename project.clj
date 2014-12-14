(defproject eulalie "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Unlicense" :url "http://unlicense.org/UNLICENSE"}
  :aot [eulalie.TestableAWS4Signer]
  :global-vars {*warn-on-reflection* true}
  :dependencies
  [[org.clojure/clojure        "1.6.0"]
   [org.clojure/core.async     "0.1.346.0-17112a-alpha"]
   [org.clojure/test.check     "0.6.1"]
   [org.clojure/core.match     "0.2.1"]
   [org.clojure/tools.logging  "0.3.1"]

   [org.slf4j/jcl-over-slf4j   "1.7.7"]
   [org.slf4j/slf4j-log4j12    "1.7.5"]
   [log4j/log4j                "1.2.17"
    :exclusions [javax.mail/mail
                 javax.jms/jms
                 com.sun.jmdk/jmxtools
                 com.sun.jmx/jmxri]]
   
   [http-kit                   "2.1.18"]
   [com.taoensso/encore        "1.14.0"]
   [com.cemerick/url           "0.1.1"]
   [cheshire                   "5.3.1"]
   [digest                     "1.4.4"]
   [com.amazonaws/aws-java-sdk "1.9.3"
    :exclusions [joda-time
                 commons-logging]]
   [joda-time                  "2.5"]])