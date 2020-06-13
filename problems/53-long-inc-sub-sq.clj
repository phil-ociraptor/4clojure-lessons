;; Given a vector of integers, find the longest consecutive sub-sequence of 
;; increasing numbers. If two sub-sequences have the same length, use the one 
;; that occurs first. An increasing sub-sequence must have a length of 2 or 
;; greater to qualify.

; Favorite solution
#(->> %
  (reductions (fn [acc curr] (if (= (last acc) (dec curr)) (conj acc curr) [curr])) [])
  (remove (fn [x] (< (count x) 2)))
  (sort-by count)
  (last)
  (vec))

; My first solution
#((reduce (fn [a b] 
        (let [current (a :current)
              longest (a :longest)
              prev (last current)]
          (if (= b (inc prev))
            (if (>= (count current) (count longest))
              {:current (conj current b) :longest (conj current b)}
              {:current (conj current b) :longest longest})
            {:current [b] :longest longest})))
        {:current [(first %)] :longest []}
        %) :longest)
