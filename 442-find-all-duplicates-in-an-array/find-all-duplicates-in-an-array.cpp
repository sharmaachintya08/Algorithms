class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        std::sort(nums.begin(), nums.end());
        vector<int> dups;
        int i = 0;
        int j = i + 1;
        while(i < nums.size() -1)
        {
            if(nums[i] == nums[j])
            {
                dups.push_back(nums[i]);
            }
            i++;
            j++;
        }
        return dups;
    }
};