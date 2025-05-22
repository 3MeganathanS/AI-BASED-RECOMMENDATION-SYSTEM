# AI-BASED-RECOMMENDATION-SYSTEM

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: MEGANATHAN S

*INTERN ID*: CT12DN552

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 12 WEEKS

*MENTOR*: NEELA SANTOSH

## Description of Task 4

Task 4 involves building an *AI-powered recommendation engine* using Java and Apache Mahout, focused on predicting user preferences based on collaborative filtering. The objective was to create a system that suggests items (such as products or services) to users based on their historical interactions and similarities with other users.

The system reads data from a CSV file named ratings.csv in the format:

userID,itemID,rating

---

## 1. Core Features:

* **User-Based Collaborative Filtering**: The system uses Apache Mahout’s GenericUserBasedRecommender to compute user similarity and recommend items that similar users have liked.
* **DataModel**: Uses Mahout’s FileDataModel to load the dataset.
* **Similarity Metric**: Utilizes LogLikelihoodSimilarity to measure the similarity between users.
* **Neighborhood**: Finds the top N (3 in this case) nearest users using NearestNUserNeighborhood.
* **Recommendation Output**: Generates the top 3 item recommendations for a given user (user ID 1 in this task), along with predicted preference scores.
* **Exception Handling**: Includes error-handling blocks for file I/O and taste exceptions.
* **Dynamic Recommendation**: Excludes items already rated by the target user.

---

## 2. Development Environment & Tools

* **IDE**: IntelliJ IDEA
  Chosen for its advanced Java support, debugging tools, and Maven dependency management.
* **Java Version**: Java SE 17 (OpenJDK)
  Ensures compatibility with Mahout libraries.
* **Libraries Used**:

  * Apache Mahout Core (0.9)
  * Mahout Math (0.13.0)
  * Commons Math3 (3.6.1)
  * Guava
  * SLF4J (for logging)
* **Build Management**: Manually added .jar files under libs directory and linked via IntelliJ classpath.
* **Platform**: Windows 11
* **Version Control**: GitHub (repository stores all source files, CSV, and build instructions)

---

## 3. Real-World Applications

* **E-commerce platforms** for suggesting products to customers.
* **Online streaming services** to recommend movies, music, or shows.
* **Educational portals** to suggest relevant courses.
* **Retail systems** to suggest promotions or bundles.
* **Basic personalization engines** for content delivery.

---

## 4. Challenges & Solutions

1. **Sparse Ratings**: Some users had rated very few items, making prediction difficult.
   Solution: Used similarity metrics that work well with sparse data like LogLikelihood.

2. **Cold Start for New Users**: No recommendations for users without prior data.
   Solution: Added code to check for and report empty recommendation lists.

3. **Library Compatibility**: Apache Mahout required compatible versions of dependent libraries.
   Solution: Manually added specific versions of Mahout and dependencies.

4. **Prediction Accuracy**: Evaluating recommendation quality.
   Solution: Reviewed predicted preference scores and manually validated outputs.

---

## 5. Key Learning Outcomes

* Understood how collaborative filtering works behind modern recommendation systems.
* Gained hands-on experience using *Apache Mahout*, one of the top open-source machine learning libraries.
* Learned how to structure and read data using Mahout’s FileDataModel.
* Explored Java concurrency, error handling, and third-party library integration.
* Understood AI’s role in personalization and user behavior analysis.
* Improved skills in debugging, dataset handling, and producing clean, modular Java code.
  
---
