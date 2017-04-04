(ns examples.function-composition)

(defn compose [foo bar]
  (fn [x & more]
    (foo (reduce bar (bar x) more)))
)
