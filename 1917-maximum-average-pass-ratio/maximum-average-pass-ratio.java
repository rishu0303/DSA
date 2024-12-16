class Solution {
    public double maxAverageRatio(int[][] classes, int extra) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0])); 
        double val = 0;
        int size = classes.length;
        for (int i = 0; i < size; i++) {
            double pass = classes[i][0];
            double total = classes[i][1];
            double ratio = pass / total;
            val += ratio;
            double gain = ((pass + 1) / (total + 1)) - ratio;
            pq.add(new double[]{gain, pass, total});
        }
        
        for (int i = 0; i < extra; i++) {
            double[] data = pq.poll();
            val -= data[1] / data[2];
            double pass = data[1] + 1;
            double total = data[2] + 1;
            double newRatio = pass / total;
            val += newRatio;
            double newGain = ((pass + 1) / (total + 1)) - newRatio;
            pq.add(new double[]{newGain, pass, total});
        }
        
        return val / size;
    }
}
