package com.example.blog_app.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PostDao_Impl implements PostDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Post> __insertionAdapterOfPost;

  private final EntityDeletionOrUpdateAdapter<Post> __deletionAdapterOfPost;

  private final EntityDeletionOrUpdateAdapter<Post> __updateAdapterOfPost;

  public PostDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPost = new EntityInsertionAdapter<Post>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `post` (`id`,`title`,`category`,`post`,`date`,`claps`,`Image`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Post value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategory());
        }
        if (value.getPost() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPost());
        }
        if (value.getDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDate());
        }
        stmt.bindLong(6, value.getClap());
        if (value.getImage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getImage());
        }
      }
    };
    this.__deletionAdapterOfPost = new EntityDeletionOrUpdateAdapter<Post>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `post` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Post value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfPost = new EntityDeletionOrUpdateAdapter<Post>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `post` SET `id` = ?,`title` = ?,`category` = ?,`post` = ?,`date` = ?,`claps` = ?,`Image` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Post value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategory());
        }
        if (value.getPost() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPost());
        }
        if (value.getDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDate());
        }
        stmt.bindLong(6, value.getClap());
        if (value.getImage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getImage());
        }
        stmt.bindLong(8, value.getId());
      }
    };
  }

  @Override
  public void insertContact(final Post post) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPost.insert(post);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteContact(final Post post) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPost.handle(post);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateContact(final Post post) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPost.handle(post);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Post>> observeContacts() {
    final String _sql = "SELECT * FROM post";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"post"}, false, new Callable<List<Post>>() {
      @Override
      public List<Post> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfPost = CursorUtil.getColumnIndexOrThrow(_cursor, "post");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfClap = CursorUtil.getColumnIndexOrThrow(_cursor, "claps");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "Image");
          final List<Post> _result = new ArrayList<Post>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Post _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpPost;
            _tmpPost = _cursor.getString(_cursorIndexOfPost);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final int _tmpClap;
            _tmpClap = _cursor.getInt(_cursorIndexOfClap);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            _item = new Post(_tmpId,_tmpTitle,_tmpCategory,_tmpPost,_tmpDate,_tmpClap,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Post>> fetchContact() {
    final String _sql = "SELECT * FROM post";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"post"}, false, new Callable<List<Post>>() {
      @Override
      public List<Post> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfPost = CursorUtil.getColumnIndexOrThrow(_cursor, "post");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfClap = CursorUtil.getColumnIndexOrThrow(_cursor, "claps");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "Image");
          final List<Post> _result = new ArrayList<Post>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Post _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpPost;
            _tmpPost = _cursor.getString(_cursorIndexOfPost);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final int _tmpClap;
            _tmpClap = _cursor.getInt(_cursorIndexOfClap);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            _item = new Post(_tmpId,_tmpTitle,_tmpCategory,_tmpPost,_tmpDate,_tmpClap,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
