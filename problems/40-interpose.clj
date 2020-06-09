;; Write a function which separates the items of a sequence by 
;; an arbitrary value.
;; Special Restrictions: interpose

; Favorite solution
#(drop-last (interleave %2 (repeat %1)))

; My first solution
#(drop-last (mapcat (fn [x] [x %1]) %2))

