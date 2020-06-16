;; Given a side-effect free function f and an initial value x write a function 
;; which returns an infinite lazy sequence of 
;; x, (f x), (f (f x)), (f (f (f x))), etc.
;; Special Restrictions: iterate

; My first solution
(fn iter [f x] (lazy-seq (cons x (iter f (f x)))))

; Interesting
#(reductions (fn [i _] (%1 i)) (repeat %2))

