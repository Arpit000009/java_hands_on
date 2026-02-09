package com.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Library {

    public Member addMember(Member member) throws SQLException {
        String query = "INSERT INTO Library(name, phoneno, email) VALUES (?,?,?)";

        try (Connection conn = DbUtility.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, member.getName());
            pstmt.setLong(2, member.getPhoneno());
            pstmt.setString(3, member.getEmail());

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                return member;
            }
        }
        return null;
    }

    public List<Member> getMember() throws SQLException {
        List<Member> list = new ArrayList<>();

        String query = "SELECT name, number, email FROM Library";

        try (Connection conn = DbUtility.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String name = rs.getString("name");
                long phone = rs.getLong("number");
                String email = rs.getString("email");

                Member member = new Member(name, phone, email);
                list.add(member);
            }
        }
        return list;
    }
}
