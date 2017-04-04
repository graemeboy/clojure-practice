(ns examples.function-composition-test
  (:require [clojure.test :refer :all]
            [examples.function-composition :refer :all]))

; Sample Functions

(defn id [n] (do n))

(defn add1 [n] (+ n 1))

(defn div2 [n] (/ n 2))

; Tests

(deftest composition-example-test
  (is (= ((compose (partial + 1) id) 0) 1))
)

(deftest composition-example-2-test
    "Mutilple arguments should be supported for the returned function!"
  (is (= ((compose add1 +) 1 2 3 4 5) 16))
)

(deftest composition-example-3-test
  "Correct order"
  (is (= ((compose add1 div2) 2) 2))
)
