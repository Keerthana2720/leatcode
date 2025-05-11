class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_len = start = 0
        seen = {}
        for i ,char in enumerate(s):
            if char in seen and seen[char] >= start:
                start = seen[char] + 1
            else:
                max_len = max(max_len, i - start + 1)
            seen[char] = i
        return max_len
        