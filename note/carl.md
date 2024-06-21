# carl

- 参考

  [代码随想录b站](https://space.bilibili.com/525438321?spm_id_from=333.337.search-card.all.click)、[代码随想录网站](https://programmercarl.com/)、
  
  leetcode



## 数组

### leetcode 704. 二分查找

- 【题目】[leetcode 704. 二分查找](https://leetcode.cn/problems/binary-search/)

  > 给定一个 `n` 个元素有序的（升序）整型数组 `nums` 和一个目标值 `target` ，写一个函数搜索 `nums` 中的 `target`，如果目标值存在返回下标，否则返回 `-1`。

  



- 思路

  数组：升序、不重复元素
  
- 具体

  nums = [1,4,7,9,12,34] 

  target = 7

  step1  9>7 -> [1,4,7,9]

  step2  4<7 -> [7,9]

  step3  7=7 -> return

- 抽象

  nums 

  [left, right]

  [lef, right)



- 伪代码

  暴力遍历
  
  ```
  /**
  input: nums: int[], target: int
  output: index: int
  */
  
  for i in range(nums):
    if (nums[i] == target): return i
  return -1
  
  ```
  
  都闭区间：(边界coding)
  
  `len(nums) - 1`、
  
  `while (left <= right)`、
  
  `right = mid - 1 `、`left = mid + 1`
  
  ```
  # [left, right]
  
  # 数组的索引初始化
  left, right = 0, len(nums) - 1  
  mid = 0 
  
  while (left <= right):  # 死循环结束条件
    mid = left + (right - left) >> 1  # 迭代更新
    if (nums[mid] > target): right = mid - 1 
    elif (nums[mid] < target): left = mid + 1
    elif (nums[mid] == target): return mid 
  return -1
  
  ```
  
  左闭右开
  
  ```
  # [lef, right)
  
  left, right = 0, len(nums)
  mid = 0
  
  while (left < right):
    mid = left + ((right - left) >> 1)
    if (nums[mid] > target): right = mid
    elif (nums[mid] < target): left = mid - 1
    elif (nums[mid] == target): return mid
  return -1
  
  ```
  
  

