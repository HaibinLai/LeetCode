package Accepted;

public class No74搜索BinarySearch {
    public boolean searchMatrix(int[][] matrix, int target) {
                if (matrix.length == 1) {
                    int left = 0;
                    int right = matrix[0].length - 1;
                    while (left <= right) {
                        int middle = (left + right) / 2;
                        if (matrix[0][middle] == target) {
                            return true;
                        } else if (matrix[0][middle] > target) {
                            right = middle - 1;
                        } else {
                            left = middle + 1;
                        }
                    }
                } else if (matrix[0].length == 1) {
                    int left = 0;
                    int right = matrix.length - 1;
                    while (left <= right) {
                        int middle = (left + right) / 2;
                        if (matrix[middle][matrix[0].length - 1] == target) {
                            return true;
                        } else if (matrix[middle][matrix[0].length - 1] > target) {
                            right = middle - 1;
                        } else {
                            left = middle + 1;
                        }
                    }
                }
                if (matrix.length != 1 && matrix[0].length != 1) {
                    int left = 0;
                    int right = matrix.length - 1;
                    while (left < right) {
                        int middle = (left + right) / 2;
                        if (matrix[middle][matrix[0].length - 1] == target) {
                            return true;
                        } else if (matrix[middle][matrix[0].length - 1] > target) {
                            right = middle - 1;
                        } else {
                            left = middle + 1;
                        }
                    }
                    if (target > matrix[left][matrix[0].length - 1]) {
                        if (left != matrix.length - 1) {
                            left++;
                        }
                    }
                    int left_r = 0;
                    int right_r = matrix[0].length - 1;
                    while (left_r <= right_r) {
                        int middle_r = (left_r + right_r) / 2;
                        if (matrix[left][middle_r] == target) {
                            return true;
                        } else if (matrix[left][middle_r] > target) {
                            right_r = middle_r - 1;
                        } else {
                            left_r = middle_r + 1;
                        }
                    }
                }
                return false;
            }
        }



