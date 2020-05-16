;; Write a function which returns true if the given sequence is a palindrome.

;; My favorite
#(= (seq %) (reverse %))

;; My first solution 👶
(fn is-palindrome [s]
  (if (< (count s) 2)
    true
    (if (= (first s) (last s))
      (is-palindrome (rest (butlast s)))
      false)))

