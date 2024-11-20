import numpy as np
class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        numpyarray = np.asarray(matrix)
        ans = np.transpose(numpyarray).tolist()
        return ans