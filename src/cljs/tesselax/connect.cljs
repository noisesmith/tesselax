(ns tesselax.connect
  (:require [clojure.browser.repl :as repl]))

(defn connect
  []
  (repl/connect "http://localhost:9000/repl"))
