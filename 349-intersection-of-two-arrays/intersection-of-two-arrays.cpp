class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> finalNums;
        for (int i = 0; i < nums1.size(); ++i) {
            for (int j = 0; j < nums2.size(); ++j) {
                if (nums1[i] == nums2[j] && find(finalNums.begin(), finalNums.end(), nums1[i]) == finalNums.end()) {
                    finalNums.push_back(nums1[i]);
                    break; 
                }
            }
        }
        return finalNums;
    }
};
