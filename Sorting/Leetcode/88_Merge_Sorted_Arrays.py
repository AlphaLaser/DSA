  # Question Link - https://leetcode.com/problems/merge-sorted-array  
  
  def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        # Merging arrays and removing all zeroes
        nums1[m:] = nums2[:n]
                   
        
        # Bubble Sort
        x = 1

        for i in range(len(nums1) - 1):

            j = 0

            for j in range(len(nums1) - x):

                if nums1[j] > nums1[j + 1]:
                    nums1[j], nums1[j + 1] = nums1[j + 1], nums1[j]

                else:
                    continue

            j += 1

        x += 1
        print(f"nums1 : {nums1}")
