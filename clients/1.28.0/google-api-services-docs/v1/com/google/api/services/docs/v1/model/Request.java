/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.docs.v1.model;

/**
 * A single update to apply to a document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Request extends com.google.api.client.json.GenericJson {

  /**
   * Creates a named range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CreateNamedRangeRequest createNamedRange;

  /**
   * Creates bullets for paragraphs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CreateParagraphBulletsRequest createParagraphBullets;

  /**
   * Deletes content from the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeleteContentRangeRequest deleteContentRange;

  /**
   * Deletes a named range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeleteNamedRangeRequest deleteNamedRange;

  /**
   * Deletes bullets from paragraphs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeleteParagraphBulletsRequest deleteParagraphBullets;

  /**
   * Deletes a positioned object from the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeletePositionedObjectRequest deletePositionedObject;

  /**
   * Deletes a column from a table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeleteTableColumnRequest deleteTableColumn;

  /**
   * Deletes a row from a table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeleteTableRowRequest deleteTableRow;

  /**
   * Inserts an inline image at the specified location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InsertInlineImageRequest insertInlineImage;

  /**
   * Inserts a page break at the specified location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InsertPageBreakRequest insertPageBreak;

  /**
   * Inserts a table at the specified location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InsertTableRequest insertTable;

  /**
   * Inserts an empty row into a table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InsertTableRowRequest insertTableRow;

  /**
   * Inserts text at the specified location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InsertTextRequest insertText;

  /**
   * Replaces all instances of the specified text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReplaceAllTextRequest replaceAllText;

  /**
   * Updates the paragraph style at the specified range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UpdateParagraphStyleRequest updateParagraphStyle;

  /**
   * Updates the text style at the specified range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UpdateTextStyleRequest updateTextStyle;

  /**
   * Creates a named range.
   * @return value or {@code null} for none
   */
  public CreateNamedRangeRequest getCreateNamedRange() {
    return createNamedRange;
  }

  /**
   * Creates a named range.
   * @param createNamedRange createNamedRange or {@code null} for none
   */
  public Request setCreateNamedRange(CreateNamedRangeRequest createNamedRange) {
    this.createNamedRange = createNamedRange;
    return this;
  }

  /**
   * Creates bullets for paragraphs.
   * @return value or {@code null} for none
   */
  public CreateParagraphBulletsRequest getCreateParagraphBullets() {
    return createParagraphBullets;
  }

  /**
   * Creates bullets for paragraphs.
   * @param createParagraphBullets createParagraphBullets or {@code null} for none
   */
  public Request setCreateParagraphBullets(CreateParagraphBulletsRequest createParagraphBullets) {
    this.createParagraphBullets = createParagraphBullets;
    return this;
  }

  /**
   * Deletes content from the document.
   * @return value or {@code null} for none
   */
  public DeleteContentRangeRequest getDeleteContentRange() {
    return deleteContentRange;
  }

  /**
   * Deletes content from the document.
   * @param deleteContentRange deleteContentRange or {@code null} for none
   */
  public Request setDeleteContentRange(DeleteContentRangeRequest deleteContentRange) {
    this.deleteContentRange = deleteContentRange;
    return this;
  }

  /**
   * Deletes a named range.
   * @return value or {@code null} for none
   */
  public DeleteNamedRangeRequest getDeleteNamedRange() {
    return deleteNamedRange;
  }

  /**
   * Deletes a named range.
   * @param deleteNamedRange deleteNamedRange or {@code null} for none
   */
  public Request setDeleteNamedRange(DeleteNamedRangeRequest deleteNamedRange) {
    this.deleteNamedRange = deleteNamedRange;
    return this;
  }

  /**
   * Deletes bullets from paragraphs.
   * @return value or {@code null} for none
   */
  public DeleteParagraphBulletsRequest getDeleteParagraphBullets() {
    return deleteParagraphBullets;
  }

  /**
   * Deletes bullets from paragraphs.
   * @param deleteParagraphBullets deleteParagraphBullets or {@code null} for none
   */
  public Request setDeleteParagraphBullets(DeleteParagraphBulletsRequest deleteParagraphBullets) {
    this.deleteParagraphBullets = deleteParagraphBullets;
    return this;
  }

  /**
   * Deletes a positioned object from the document.
   * @return value or {@code null} for none
   */
  public DeletePositionedObjectRequest getDeletePositionedObject() {
    return deletePositionedObject;
  }

  /**
   * Deletes a positioned object from the document.
   * @param deletePositionedObject deletePositionedObject or {@code null} for none
   */
  public Request setDeletePositionedObject(DeletePositionedObjectRequest deletePositionedObject) {
    this.deletePositionedObject = deletePositionedObject;
    return this;
  }

  /**
   * Deletes a column from a table.
   * @return value or {@code null} for none
   */
  public DeleteTableColumnRequest getDeleteTableColumn() {
    return deleteTableColumn;
  }

  /**
   * Deletes a column from a table.
   * @param deleteTableColumn deleteTableColumn or {@code null} for none
   */
  public Request setDeleteTableColumn(DeleteTableColumnRequest deleteTableColumn) {
    this.deleteTableColumn = deleteTableColumn;
    return this;
  }

  /**
   * Deletes a row from a table.
   * @return value or {@code null} for none
   */
  public DeleteTableRowRequest getDeleteTableRow() {
    return deleteTableRow;
  }

  /**
   * Deletes a row from a table.
   * @param deleteTableRow deleteTableRow or {@code null} for none
   */
  public Request setDeleteTableRow(DeleteTableRowRequest deleteTableRow) {
    this.deleteTableRow = deleteTableRow;
    return this;
  }

  /**
   * Inserts an inline image at the specified location.
   * @return value or {@code null} for none
   */
  public InsertInlineImageRequest getInsertInlineImage() {
    return insertInlineImage;
  }

  /**
   * Inserts an inline image at the specified location.
   * @param insertInlineImage insertInlineImage or {@code null} for none
   */
  public Request setInsertInlineImage(InsertInlineImageRequest insertInlineImage) {
    this.insertInlineImage = insertInlineImage;
    return this;
  }

  /**
   * Inserts a page break at the specified location.
   * @return value or {@code null} for none
   */
  public InsertPageBreakRequest getInsertPageBreak() {
    return insertPageBreak;
  }

  /**
   * Inserts a page break at the specified location.
   * @param insertPageBreak insertPageBreak or {@code null} for none
   */
  public Request setInsertPageBreak(InsertPageBreakRequest insertPageBreak) {
    this.insertPageBreak = insertPageBreak;
    return this;
  }

  /**
   * Inserts a table at the specified location.
   * @return value or {@code null} for none
   */
  public InsertTableRequest getInsertTable() {
    return insertTable;
  }

  /**
   * Inserts a table at the specified location.
   * @param insertTable insertTable or {@code null} for none
   */
  public Request setInsertTable(InsertTableRequest insertTable) {
    this.insertTable = insertTable;
    return this;
  }

  /**
   * Inserts an empty row into a table.
   * @return value or {@code null} for none
   */
  public InsertTableRowRequest getInsertTableRow() {
    return insertTableRow;
  }

  /**
   * Inserts an empty row into a table.
   * @param insertTableRow insertTableRow or {@code null} for none
   */
  public Request setInsertTableRow(InsertTableRowRequest insertTableRow) {
    this.insertTableRow = insertTableRow;
    return this;
  }

  /**
   * Inserts text at the specified location.
   * @return value or {@code null} for none
   */
  public InsertTextRequest getInsertText() {
    return insertText;
  }

  /**
   * Inserts text at the specified location.
   * @param insertText insertText or {@code null} for none
   */
  public Request setInsertText(InsertTextRequest insertText) {
    this.insertText = insertText;
    return this;
  }

  /**
   * Replaces all instances of the specified text.
   * @return value or {@code null} for none
   */
  public ReplaceAllTextRequest getReplaceAllText() {
    return replaceAllText;
  }

  /**
   * Replaces all instances of the specified text.
   * @param replaceAllText replaceAllText or {@code null} for none
   */
  public Request setReplaceAllText(ReplaceAllTextRequest replaceAllText) {
    this.replaceAllText = replaceAllText;
    return this;
  }

  /**
   * Updates the paragraph style at the specified range.
   * @return value or {@code null} for none
   */
  public UpdateParagraphStyleRequest getUpdateParagraphStyle() {
    return updateParagraphStyle;
  }

  /**
   * Updates the paragraph style at the specified range.
   * @param updateParagraphStyle updateParagraphStyle or {@code null} for none
   */
  public Request setUpdateParagraphStyle(UpdateParagraphStyleRequest updateParagraphStyle) {
    this.updateParagraphStyle = updateParagraphStyle;
    return this;
  }

  /**
   * Updates the text style at the specified range.
   * @return value or {@code null} for none
   */
  public UpdateTextStyleRequest getUpdateTextStyle() {
    return updateTextStyle;
  }

  /**
   * Updates the text style at the specified range.
   * @param updateTextStyle updateTextStyle or {@code null} for none
   */
  public Request setUpdateTextStyle(UpdateTextStyleRequest updateTextStyle) {
    this.updateTextStyle = updateTextStyle;
    return this;
  }

  @Override
  public Request set(String fieldName, Object value) {
    return (Request) super.set(fieldName, value);
  }

  @Override
  public Request clone() {
    return (Request) super.clone();
  }

}
