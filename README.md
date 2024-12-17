# binary-s

#include <iostream>
using namespace std;

// Define the Node structure
struct Node {
    int data;
    Node* left;
    Node* right;
    
    Node(int value) {
        data = value;
        left = right = nullptr;
    }
};

// Function to insert a new node into the BST
Node* insert(Node* root, int value) {
    if (!root) return new Node(value);  // Create a new node if root is null
    if (value < root->data) root->left = insert(root->left, value);  // Insert in left
    else root->right = insert(root->right, value);  // Insert in right
    return root;
}

// Function to search for a value in the BST
bool search(Node* root, int value) {
    if (!root) return false;  // If root is null, return false
    if (root->data == value) return true;  // If found, return true
    return (value < root->data) ? search(root->left, value) : search(root->right, value);
}

// Function to calculate the depth of the tree
int depth(Node* root) {
    if (!root) return 0;
    int leftDepth = depth(root->left);
    int rightDepth = depth(root->right);
    return max(leftDepth, rightDepth) + 1;
}

// Function to display leaf nodes (nodes with no children)
void displayLeafNodes(Node* root) {
    if (!root) return;
    if (!root->left && !root->right) cout << root->data << " ";  // Leaf node
    displayLeafNodes(root->left);  // Left subtree
    displayLeafNodes(root->right);  // Right subtree
}

// Main function to demonstrate BST operations
int main() {
    Node* root = nullptr;

    // Insert values into the BST
    root = insert(root, 50);
    insert(root, 30);
    insert(root, 20);
    insert(root, 40);
    insert(root, 70);
    insert(root, 60);
    insert(root, 80);

    // Search for a value
    cout << "Searching for 40: " << (search(root, 40) ? "Found" : "Not Found") << endl;

    // Display depth of the tree
    cout << "Depth of the tree: " << depth(root) << endl;

    // Display leaf nodes
    cout << "Leaf nodes: ";
    displayLeafNodes(root);
    cout << endl;

    return 0;
}
