;; Write a function which returns the total number of elements in a sequence.
;; (Without using count)

;; My favorite
#(reduce + (map (constantly 1) %))
#(reduce + (map (fn [_] 1) %))

;; Notes: function_creation (for constantly)
