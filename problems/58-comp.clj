;; Write a function which returns a map containing the number of occurences of 
;; each distinct item in a sequence.
;; Special Restrictions: frequencies

; My favorite solution
(fn [& fns]
  (fn [& args]
    (let [[f & fns] (reverse fns)]
      (reduce #(%2 %1) (apply f args) fns))))

; My first solution - did not record it, when I saw the solution above, there
; was no other solution that mattered
