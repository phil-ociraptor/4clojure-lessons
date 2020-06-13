;; Write a function which returns a sequence of lists of x items each. Lists of
;; less than x items should not be returned.
;; Special Restrictions: partition, partition-all

; Loop solution (best)
#(loop [s %2
        acc []]
   (if (< (count s) %1)
     acc
     (recur (drop %1 s) (conj acc (take %1 s)))))

; Loop solution (alternative styling, not sure what's more Clojure friendly)
#(loop [xs %2 acc []]
  (if (< (count xs) %) acc
   (recur (drop % xs) (conj acc (take % xs)))))

; Recursion solution (Stackoverflows)
(fn part [n s]
  (if (< (count s) n)
    ()
    (cons (take n s) (part n (drop n s)))))

; My first solution
#(->> %2
      (reductions (fn [a b] (if (= (count a) %) [b] (conj a b))) [])
      (filter (fn [x] (= (count x) %))))

; Notes - loop
