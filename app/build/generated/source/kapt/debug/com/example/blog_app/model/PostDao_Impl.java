package com.example.blog_app.model;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
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

  @Override
  public LiveData<List<PostWithComments>> getPostsandComments() {
    final String _sql = "SELECT * FROM post";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"comments","post"}, true, new Callable<List<PostWithComments>>() {
      @Override
      public List<PostWithComments> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
            final int _cursorIndexOfPost = CursorUtil.getColumnIndexOrThrow(_cursor, "post");
            final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
            final int _cursorIndexOfClap = CursorUtil.getColumnIndexOrThrow(_cursor, "claps");
            final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "Image");
            final LongSparseArray<ArrayList<Comment>> _collectionComments = new LongSparseArray<ArrayList<Comment>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<Comment> _tmpCommentsCollection = _collectionComments.get(_tmpKey);
              if (_tmpCommentsCollection == null) {
                _tmpCommentsCollection = new ArrayList<Comment>();
                _collectionComments.put(_tmpKey, _tmpCommentsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipcommentsAscomExampleBlogAppModelComment(_collectionComments);
            final List<PostWithComments> _result = new ArrayList<PostWithComments>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PostWithComments _item;
              final Post _tmpPost;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfCategory) && _cursor.isNull(_cursorIndexOfPost) && _cursor.isNull(_cursorIndexOfDate) && _cursor.isNull(_cursorIndexOfClap) && _cursor.isNull(_cursorIndexOfImage))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpTitle;
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                final String _tmpCategory;
                _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
                final String _tmpPost_1;
                _tmpPost_1 = _cursor.getString(_cursorIndexOfPost);
                final String _tmpDate;
                _tmpDate = _cursor.getString(_cursorIndexOfDate);
                final int _tmpClap;
                _tmpClap = _cursor.getInt(_cursorIndexOfClap);
                final String _tmpImage;
                _tmpImage = _cursor.getString(_cursorIndexOfImage);
                _tmpPost = new Post(_tmpId,_tmpTitle,_tmpCategory,_tmpPost_1,_tmpDate,_tmpClap,_tmpImage);
              }  else  {
                _tmpPost = null;
              }
              ArrayList<Comment> _tmpCommentsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpCommentsCollection_1 = _collectionComments.get(_tmpKey_1);
              if (_tmpCommentsCollection_1 == null) {
                _tmpCommentsCollection_1 = new ArrayList<Comment>();
              }
              _item = new PostWithComments(_tmpPost,_tmpCommentsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  private void __fetchRelationshipcommentsAscomExampleBlogAppModelComment(final LongSparseArray<ArrayList<Comment>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<Comment>> _tmpInnerMap = new LongSparseArray<ArrayList<Comment>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipcommentsAscomExampleBlogAppModelComment(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<Comment>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipcommentsAscomExampleBlogAppModelComment(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `commentId`,`comment` FROM `comments` WHERE `commentId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "commentId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfPostId = CursorUtil.getColumnIndex(_cursor, "commentId");
      final int _cursorIndexOfComment = CursorUtil.getColumnIndex(_cursor, "comment");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<Comment> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final Comment _item_1;
          final int _tmpPostId;
          if (_cursorIndexOfPostId == -1) {
            _tmpPostId = 0;
          } else {
            _tmpPostId = _cursor.getInt(_cursorIndexOfPostId);
          }
          final String _tmpComment;
          if (_cursorIndexOfComment == -1) {
            _tmpComment = null;
          } else {
            _tmpComment = _cursor.getString(_cursorIndexOfComment);
          }
          _item_1 = new Comment(_tmpPostId,_tmpComment);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
