import java.io.File;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.util.List;

/**
 * RecommendationEngine
 *
 * A simple user-based collaborative filtering example using Apache Mahout.
 * Reads user–item ratings from a CSV and prints top-3 recommendations for user 1.
 */
public class RecommendationEngine {

    public static void main(String[] args) {
        try {
            // 1. Load the data model from CSV
            File ratingsFile = new File("ratings.csv");
            DataModel model = new FileDataModel(ratingsFile);

            // 2. Compute user similarity based on Pearson correlation
            UserSimilarity similarity = new LogLikelihoodSimilarity(model);

            // 3. Pick top 2 nearest neighbors for each user
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(3, similarity, model);

            // 4. Build the recommender
            Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            // 5. Ask for top 3 recommendations for user with ID = 1
            List<RecommendedItem> recommendations = recommender.recommend(1, 3);
if(recommendations.isEmpty()){
    System.out.println("No recommendations");
}
else {
    System.out.println("Top 3 recommendations for user 1:");
    for (RecommendedItem item : recommendations) {
        System.out.printf("  Item %d (predicted preference: %.2f)%n",
                item.getItemID(), item.getValue());
    }
}
        } catch (Exception e) {
            System.err.println("Error in recommendation engine: " + e.getMessage());
            e.printStackTrace();
        }
    }
}