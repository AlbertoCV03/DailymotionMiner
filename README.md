# Dailymotion Channel API Documentation

## Overview

- **OpenAPI Version:** 3.1.0
- **API Version:** v0
- **Base URL:** `http://localhost:8082`
- **Tag:** Channel

---

# Endpoints

## `GET /dailymotion/v1/{channelId}`

Retrieves a Dailymotion channel by its channel ID.

### Description

Returns a `ChannelDTO` object by specifying its channel ID.

### Path Parameters

| Name | Type | Required | Description |
|------|------|----------|-------------|
| `channelId` | string | Yes | The ID of the channel to retrieve |

### Query Parameters

| Name | Type | Required | Default | Description | Example |
|------|------|----------|---------|-------------|---------|
| `maxVideos` | integer | No | `10` | Maximum number of videos to be searched | `1` |
| `maxPages` | integer | No | `2` | Maximum number of pages per request to be searched | - |

### Responses

#### `200 OK`
Channel retrieved successfully.

**Content-Type:** `application/json`

**Schema:** `ChannelDTO`

**Example Response**

```json
{
  "id": "x4yq48o",
  "name": "Pasion SD",
  "description": "",
  "createdTime": "2026-04-25T23:59:47Z",
  "videos": [
    {
      "id": "xa8nv0g",
      "name": "Hidden Companionship | HD 1080p",
      "description": "Hidden Companionship - Serie completa en español...",
      "releaseTime": "2026-05-08T22:36:17Z",
      "user": {
        "id": null,
        "name": "PasionSD",
        "user_link": "https://www.dailymotion.com/PasionSD",
        "picture_link": "https://s2.dmcdn.net/d/5000002HraHpp/720x720"
      },
      "comments": [
        {
          "id": "656d498a-4913-43ba-9fff-ed3cbc6d94c2",
          "text": "hidden companionship",
          "createdOn": "2026-05-08T22:36:17Z"
        }
      ],
      "captions": [
        {
          "id": "xa8nv0g.es",
          "link": "https://static2.dmcdn.net/.../subtitle_es.srt",
          "language": "es"
        }
      ]
    }
  ]
}
```

#### `404 Not Found`
❌ *Channel not found*

---

## `POST /dailymotion/v1/{id}`

Saves a Dailymotion channel to VideoMiner by its channel ID.

### Description

Posts a `ChannelDTO` object to VideoMiner by specifying its channel ID.

### Path Parameters

| Name | Type | Required | Description |
|------|------|----------|-------------|
| `id` | string | Yes | Name of channel to be created |

### Query Parameters

| Name | Type | Required | Default | Description |
|------|------|----------|---------|-------------|
| `maxVideos` | integer | No | `10` | Maximum number of videos to be included |
| `maxPages` | integer | No | `2` | Maximum number of pages per request to be included |

### Responses

#### `201 Created`
Channel successfully created.

**Content-Type:** `application/json`

**Schema:** `ChannelDTO`

#### `500 Internal Server Error`
The sent channel object was incorrectly formed, usually caused by a non-existing channel name.

---

# Data Models

## `ChannelDTO`

```json
{
  "id": "string",
  "name": "string",
  "description": "string",
  "createdTime": "string",
  "videos": [
    "VideoDTO"
  ]
}
```

### Fields

| Field | Type | Description |
|------|------|-------------|
| `id` | string | Channel ID |
| `name` | string | Channel name |
| `description` | string | Channel description |
| `createdTime` | string | Channel creation timestamp |
| `videos` | `VideoDTO[]` | List of videos |

---

## `VideoDTO`

```json
{
  "id": "string",
  "name": "string",
  "description": "string",
  "releaseTime": "string",
  "user": "UserDTO",
  "comments": ["CommentDTO"],
  "captions": ["CaptionPropertiesDTO"]
}
```

### Fields

| Field | Type | Description |
|------|------|-------------|
| `id` | string | Video ID |
| `name` | string | Video title |
| `description` | string | Video description |
| `releaseTime` | string | Video publication timestamp |
| `user` | `UserDTO` | Video author information |
| `comments` | `CommentDTO[]` | Video comments |
| `captions` | `CaptionPropertiesDTO[]` | Available captions |

---

## `UserDTO`

```json
{
  "id": "string",
  "name": "string",
  "user_link": "string",
  "picture_link": "string"
}
```

### Fields

| Field | Type | Description |
|------|------|-------------|
| `id` | string | User ID |
| `name` | string | Username |
| `user_link` | string | Link to the user's Dailymotion page |
| `picture_link` | string | Profile image URL |

---

## `CommentDTO`

```json
{
  "id": "string",
  "text": "string",
  "createdOn": "string"
}
```

### Fields

| Field | Type | Description |
|------|------|-------------|
| `id` | string | Comment ID |
| `text` | string | Comment text |
| `createdOn` | string | Comment timestamp |

---

## `CaptionPropertiesDTO`

```json
{
  "id": "string",
  "link": "string",
  "language": "string"
}
```

### Fields

| Field | Type | Description |
|------|------|-------------|
| `id` | string | Caption ID |
| `link` | string | URL to the subtitle file |
| `language` | string | Caption language code |
