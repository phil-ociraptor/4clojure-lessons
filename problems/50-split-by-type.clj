;; Write a function which takes a sequence consisting of items with different 
;; types and splits them up into a set of homogeneous sub-sequences. The 
;; internal order of each sub-sequence should be maintained, but the 
;; sub-sequences themselves can be returned in any order (this is why 'set' 
;; is used in the test cases).

; My first solution (which was also my favorite 😎)
#(vals (group-by type %))

