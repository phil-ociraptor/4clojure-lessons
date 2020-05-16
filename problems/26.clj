;; Write a function which returns the first X fibonacci numbers.

;; My favorite
#(take % (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1])))

;; Very similar solution:
;; Arguably better than above, but I prefer iterate to lazy-seq. Maybe just not
;; used to lazy-seq yet. The above does have a nasty "first" because of iterate
#(take % ((fn fib [a b] (cons a (lazy-seq (fib b (+ a b))))) 1 1))

;; Other solution I liked (and adapted)
(fn [x] (reverse ((fn fib [n]
  (case n
    2 '(1 1)
    1 '(1)
    (let [prev (fib (- n 1))]
      (cons (+ (first prev) (second prev)) prev)))) x)))

;; Hilariously unscalable solution
#(take % [1 1 2 3 5 8 13 21])


;; My first solution 🤮
#(reduce (fn [coll x] (conj coll (apply + (take-last 2 coll))))  [1 1] (repeat (- % 2) 1))


;; Notes: lazy-seq, iterate, let
