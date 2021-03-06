package tree

import example

fun main() {
    val tree = makeBeverageTree()
    "Tree Depth First traversal" example {
        tree.forEachDepthFirst { println(it.value) }
    }

    "Tree Level-order traversal" example {
        tree.forEachLevelOrder { println(it.value) }
    }

    "Tree search" example {
        tree.search("ginger ale")?.let {
            println("Found node: ${it.value}")
        }

        tree.search("WKD Blue")?.let {
            println(it.value)
        } ?: println("Couldn't find WKD Blue")
    }

    "Tree Level-order print each level per line" example {
        tree.printEachLevel()
    }


    val binaryTree = makeBinaryTree()

    "Binary printing algorithm" example {
        println(binaryTree)
    }

    "Binary Tree in-order traversal" example {
        binaryTree.traverseInOrder { println(it) }
    }

    "Binary Tree pre-order traversal" example {
        binaryTree.traversePreOrder { println(it) }
    }

    "Binary Tree post-order traversal" example {
        binaryTree.traversePostOrder { println(it) }
    }

    "Binary Tree height calculation" example {
        println(binaryTree.height())
    }

    "Binary Tree serialization and deserialization" example {
        println(binaryTree)
        val array = binaryTree.serialize()
        println("serialized => $array")
        print("deserialized =>")
        val newTree = binaryTree.deserialize(array)
        println(newTree)
    }

    val exampleBinaryTree = BinarySearchTree<Int>()
    "Binary Search Tree building a BST" example {
        exampleBinaryTree.apply {
            insert(3)
            insert(1)
            insert(4)
            insert(0)
            insert(2)
            insert(5)
        }
        println(exampleBinaryTree)

    }
    "Binary Search Tree Finding a node" example {
        if (exampleBinaryTree.contains(5)) {
            println("Found 5!")
        } else {
            println("Couldn't find 5")
        }
    }

    "Binary Search Tree removing a node" example {
        println("Tree before removal:")
        println(exampleBinaryTree)
        exampleBinaryTree.remove(3)
        println("Tree after removing root:")
        println(
            exampleBinaryTree
        )
    }

    "Check if binary search tree" example {
        println(
            binaryTree
        )
        println(binaryTree.isBinarySearchTree())
    }

    "AVL, repeated insertions in sequence" example {
        val avlTree = AVL<Int>()

        (0..10).forEach {
            avlTree.insert(it)
        }
        avlTree.insert(15)
        avlTree.insert(11)
        avlTree.insert(16)
        avlTree.insert(18)
        println(avlTree)
        avlTree.remove(10)
        println(avlTree)
    }


}