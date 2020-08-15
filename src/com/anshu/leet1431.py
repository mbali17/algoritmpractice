class Solution():
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        x = max(candies)
        list2 = []
        for i in candies:
            if extraCandies + i >= x:
                list2.append(True)
            else:
                list2.append(False)

        print(list2)
sun =Solution()
sun.kidsWithCandies([2,3,5,1,3], 3)