;; Write a function which flattens a sequence.
;; Special Restrictions: flatten

;; My favorite
#(remove coll? (tree-seq coll? seq %))

;; Probably the classical answer
(fn f [s]
  (reduce
   #(if (coll? %2)
       (concat %1 (f %2))
       (concat %1 (list %2)))
   '()
   s))

;; Sneaky
(fn f [x] (if (coll? x) (mapcat f x) [x]))

;; Good solutions (what I tried to write the first time, but failed)
(fn squash [s]
  (cond
   (empty? s) ()
   (coll? (first s)) (concat (squash (first s)) (squash (rest s)))
   :else (cons (first s) (squash (rest s)))))

;; Notes: tree-seq, mapcat
