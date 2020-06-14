The docs: https://clojuredocs.org/clojure.core/loop

Not yet comfortable with loop, as it doesn't quite feel like the recursion I'm
used to.

ANYways...

The idea is loop allows you to "bind" some variables to initial values, and
then use `recur` to iterate through the values, accumulating the result into
an "accumulator" value.

To stop the loop, check if the iteration is done, and return the accumulator.

## Favorite example from docs:

```
(loop [iter 1
       acc  0]
  (if (> iter 10)
    acc ; notice how it returns the acc - this is an idiom
    (recur (inc iter) (+ acc iter))))

;; => 55
;; sum from 1 to 10
```

## When to use:

Anytime you reach for recursion, you need to use the `recur` construct. The
`loop` + `recur` combo is a way to do a loop without declaring a function just
for the purpose of recursion.

