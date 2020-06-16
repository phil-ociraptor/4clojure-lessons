;; Write a function which behaves like reduce, but returns each intermediate 
;; value of the reduction. Your function must accept either two or three 
;; arguments, and the return sequence must be lazy.
;; Special Restrictions: reductions

; My favorite solution
(fn r
  ([f [head & tail]] (r f head tail))
  ([f init arr] (lazy-seq (cons init (if (seq arr) (r f (f init (first arr)) (rest arr)))))))

; My first solution (I had to watch a YouTube video, I couldn't get it by myself)
