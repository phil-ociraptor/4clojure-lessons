; Write a function which drops every Nth item from a sequence.

; Favorite solution
#(apply map list (partition %2 %)) ; much cleaner to use list

; My first solution
; step 1, break it up into partitions
; i.e. (partition n coll)

; step 2, the first elem of each gets put into its group, the second elem of 
; each in another. Perfect job for map
; i.e. (map (fn [& x] x) partition1 partition2 ...)

; step 3, but we need to apply the result of step 1 against the process of step 2

; all together:
#(apply map (fn [& x] x) (partition %2 %1))

