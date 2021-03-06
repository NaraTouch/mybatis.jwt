PGDMP     *                    x            restapi    12.3    12.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    24735    restapi    DATABASE     �   CREATE DATABASE restapi WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE restapi;
                postgres    false            �            1259    24736    blog    TABLE     z   CREATE TABLE public.blog (
    title character varying(50) NOT NULL,
    content text NOT NULL,
    id bigint NOT NULL
);
    DROP TABLE public.blog;
       public         heap    postgres    false            �            1259    24781    blog_id_seq    SEQUENCE     �   CREATE SEQUENCE public.blog_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.blog_id_seq;
       public          postgres    false    202                       0    0    blog_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE public.blog_id_seq OWNED BY public.blog.id;
          public          postgres    false    205            �            1259    24741 	   user_info    TABLE     �   CREATE TABLE public.user_info (
    username character(50) NOT NULL,
    password character varying(100) NOT NULL,
    fullname character(50) NOT NULL,
    id bigint NOT NULL
);
    DROP TABLE public.user_info;
       public         heap    postgres    false            �            1259    24746    user_info_id_seq    SEQUENCE     �   CREATE SEQUENCE public.user_info_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.user_info_id_seq;
       public          postgres    false    203                       0    0    user_info_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.user_info_id_seq OWNED BY public.user_info.id;
          public          postgres    false    204            �
           2604    24790    blog id    DEFAULT     b   ALTER TABLE ONLY public.blog ALTER COLUMN id SET DEFAULT nextval('public.blog_id_seq'::regclass);
 6   ALTER TABLE public.blog ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    205    202            �
           2604    24767    user_info id    DEFAULT     l   ALTER TABLE ONLY public.user_info ALTER COLUMN id SET DEFAULT nextval('public.user_info_id_seq'::regclass);
 ;   ALTER TABLE public.user_info ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    204    203            
          0    24736    blog 
   TABLE DATA           2   COPY public.blog (title, content, id) FROM stdin;
    public          postgres    false    202   �                 0    24741 	   user_info 
   TABLE DATA           E   COPY public.user_info (username, password, fullname, id) FROM stdin;
    public          postgres    false    203   ;                  0    0    blog_id_seq    SEQUENCE SET     9   SELECT pg_catalog.setval('public.blog_id_seq', 8, true);
          public          postgres    false    205                       0    0    user_info_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.user_info_id_seq', 5, true);
          public          postgres    false    204            �
           2606    24792    blog blog_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY public.blog
    ADD CONSTRAINT blog_pkey PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.blog DROP CONSTRAINT blog_pkey;
       public            postgres    false    202            �
           2606    24769    user_info user_info_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.user_info
    ADD CONSTRAINT user_info_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.user_info DROP CONSTRAINT user_info_pkey;
       public            postgres    false    203            
   k   x�+I-.Q0�R�y�
��y%�y C�����!'�����`iil�i̕�ZQ�P��X�Z�YP����\� �4@�2B��5�4�+k�eihh��P� �4����� ��3�         �   x����R�@ ���8#,�ۭ6$6�u�.ъ���N����g�N���O�*+q#$/�z^˫K4�5��0dr��3x؞��r�;2%�˱�'̤��X�
Ȟ%#W���T��P_H�0���Ar�\ly��)ߒAQ͎8j��0��e0A���_vo���{4@��1��"a_�fwW-�i�f�����=�Lƶ�+a����e�>�{�I�u>�F�>H<� �wEq�     