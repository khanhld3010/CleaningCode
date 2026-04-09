package tenisGame;

public class TennisGame {
    private static final String[] ScoreNames = {"Love", "Fifteen", "Thirty", "Forty"};

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getTieScore(player1Score);
        }
        if (player1Score >= 4 || player2Score >= 4) {
            return getAdvantageScore(player1Name, player2Name, player1Score, player2Score);
        }

        return ScoreNames[player1Score] + "-" + ScoreNames[player2Score];
    }

    private static String getAdvantageScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) {
            return "Advantage " + player1Name;
        }
        if (scoreDifference == -1) {
            return "Advantage " + player2Name;
        }
        if (scoreDifference >= 2) {
            return "Win for " + player1Name;
        } else {
            return "Win for " + player2Name;
        }
    }

    private static String getTieScore(int score) {
        if (score > 3) {
            return "Deuce";
        } else {
            return ScoreNames[score] + "-All";
        }
    }

    private static boolean isABoolean(int m_score1, int m_score2) {
        return m_score1 == m_score2;
    }
}