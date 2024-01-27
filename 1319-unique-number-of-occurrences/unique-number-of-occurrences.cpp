class Solution {
public:
    bool uniqueOccurrences(std::vector<int>& arr) {
    // Sorting the array
    std::sort(arr.begin(), arr.end());

    // Counting occurrences
    int count = 1;
    std::vector<int> occurrences;
    for (int i = 1; i < arr.size(); ++i) {
        if (arr[i] == arr[i - 1]) {
            count++;
        } else {
            occurrences.push_back(count);
            count = 1;
        }
    }
    occurrences.push_back(count);

    // Sorting the occurrences array
    std::sort(occurrences.begin(), occurrences.end());

    // Checking for uniqueness of occurrences
    for (int i = 1; i < occurrences.size(); ++i) {
        if (occurrences[i] == occurrences[i - 1]) {
            return false;
        }
    }

    return true;
    }
};