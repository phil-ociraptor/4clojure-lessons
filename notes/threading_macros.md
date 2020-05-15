The docs (thread-first): https://clojuredocs.org/clojure.core/-%3E
The docs (thread-last):  https://clojuredocs.org/clojure.core/-%3E%3E
Recommended YouTube: https://youtu.be/qxE5wDbt964

The `->` and `->>` macros help reduce nesting when performing a sequence of
operations on the same data. 

In this sense, they are a lot like the pipe operator in some languages 
`|` or `|>`

## Favorite example from docs:

Improving readability with `->`
```
;; Arguably a bit cumbersome to read:
user=> (first (.split (.replace (.toUpperCase "a b c d") "A" "X") " "))
"X"

;; Perhaps easier to read:
user=> (-> "a b c d" 
           .toUpperCase 
           (.replace "A" "X") 
           (.split " ") 
           first)
"X"
```

Improving readibility with `->>`
```
;; An example of using the "thread-last" macro to get
;; the sum of the first 10 even squares.
user=> (->> (range)
            (map #(* % %))
            (filter even?)
            (take 10)
            (reduce +))
1140

;; This expands to:
user=> (reduce +
               (take 10
                     (filter even?
                             (map #(* % %)
                                  (range)))))
1140

```

`->` Is also  good for plucking out deeply nested data
```
user=> (-> person :employer :address :city)
"Creve Coeur"

;; same as above, but with more nesting
user=> (:city (:address (:employer person)))
"Creve Coeur"
```

## When to use -> (thread-first)

  - When you're operating on a single object
  - When you're accessing deeply nested data

## When to use ->> (thread-last)

  - When you're operating on collections


## What I like:

Using a macro to eliminate nesting is really nice. I think the result is way
more readable.

The synxtax is a little foreign though, and has a learning curve, but it seems
common enough that it's a rite of passage for a beginner Clojurian
