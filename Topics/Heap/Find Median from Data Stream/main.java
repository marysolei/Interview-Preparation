//Question Link: https://leetcode.com/problems/find-median-from-data-stream/

type MedianFinder struct {
    arr []int
}


/** initialize your data structure here. */
func Constructor() MedianFinder {
    return MedianFinder { arr : make([]int, 0, 10)}
}

func bsearch (l, h , k int , a []int ) int {
    if l> h {
        return -1
    }
    mid := l+ (h-l)/2

    if a[mid]== k {
        return mid
    }
    if a[mid]< k {
        if mid< len(a)-1 && a[mid+1] > k || mid == len(a)-1 {
            return mid
        }
        return bsearch(mid+1, h, k, a)
    }
    return bsearch(l, mid-1, k , a)
}

func (this *MedianFinder) AddNum(num int)  {
    ind := bsearch(0, len(this.arr)-1, num, this.arr)+1
    this.arr = append (this.arr, -1 )
    // Move all elements to right by 1 position
    copy(this.arr[ind+1:], this.arr[ind:])
    this.arr[ind]= num

}


func (this *MedianFinder) FindMedian() float64 {

    arrlen := len(this.arr)
    if arrlen%2 ==0 {
        return float64(this.arr[arrlen/2]+ this.arr[arrlen/2-1] )/2.0
    }
    return float64(this.arr[arrlen/2])
}


/**
 * Your MedianFinder object will be instantiated and called as such:
 * obj := Constructor();
 * obj.AddNum(num);
 * param_2 := obj.FindMedian();
 */
