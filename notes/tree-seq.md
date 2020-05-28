The docs: https://clojuredocs.org/clojure.core/tree-seq

`(tree-seq branch? children root)`

Performs a depth-first treversal of all nodes in a tree. 

The `branch?` fn is called on each visited node to see if it can have children
 (a common fn passed here is `sequential?`). 

The `children` fn is called on everything that is a branch? and is basically 
the "getter" for the children (a common fn passed in here is `identity`).

Finally `root` is the root node of this tree.

## Favorite example from docs:

```
(def t '((1 2 (3)) (4)))
;;=> #'user/t

;; Here the tree-seq uses 'sequential?' as the 'branch?' predicate.
;; This causes the 'children' function to run for any collection.
;; The 'seq' ('children') function recurses on all items in the collection.
;; This results in a sequence of sub-trees, rooted at each node.
(tree-seq sequential? seq x)
;;=> (((1 2 (3)) (4))
;;    (1 2 (3)) 1 2 
;;    (3) 3 (4) 4)

;; (The following example is from 4Clojure)
;; It returns the leaves of a tree as a sequence.
;; 
(defn flatten [x]
  (filter (complement sequential?)
          (rest (tree-seq sequential? seq x))))
(flatten t)
;;=> (1 2 3 4)

```

## When to use:

When you're trying to perform a depth-first traversal of a tree, this is the
fn to use.

