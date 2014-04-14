(ns it.core-test
  (:use midje.sweet)
  (:require [clj-http.client :as client]
            [it.core :refer :all]))

(against-background [(before :contents (start-server))
                     (after :contents (stop-server))]

  (fact "hello world is served at root"
    (let [response (client/get "http://localhost:3000")]
      (response :status) => 200
      (response :body) => "just testing")))